package com.example.f1.setting;

import com.google.gson.JsonPrimitive;
import java.util.List;
import java.util.Locale;

/**
 * A choice from a fixed list. Drawn as a cycle button showing the current option.
 *
 * @param <E> the option type, usually an enum
 */
public final class EnumSetting<E extends Enum<E>> extends Setting<E> {
	private final List<E> options;

	public EnumSetting(String name, E defaultValue, Class<E> type) {
		this(name, defaultValue, List.of(type.getEnumConstants()));
	}

	public EnumSetting(String name, E defaultValue, List<E> options) {
		super(name, defaultValue);
		this.options = List.copyOf(options);
	}

	/** @return the options in display order. */
	public List<E> getOptions() {
		return options;
	}

	/** Moves to the next option, wrapping around. */
	public void next() {
		int index = options.indexOf(get());
		set(options.get((index + 1) % options.size()));
	}

	/** Moves to the previous option, wrapping around. */
	public void previous() {
		int index = options.indexOf(get());
		set(options.get((index - 1 + options.size()) % options.size()));
	}

	/** @return the label shown for an option. */
	public static String labelOf(Enum<?> option) {
		String[] words = option.name().toLowerCase(Locale.ROOT).split("_");
		StringBuilder text = new StringBuilder();
		for (String word : words) {
			if (word.isEmpty()) {
				continue;
			}
			if (text.length() > 0) {
				text.append(' ');
			}
			text.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
		}
		return text.toString();
	}

	/** @return the label of the current option. */
	public String label() {
		return labelOf(get());
	}

	@Override
	public EnumSetting<E> describe(String text) {
		super.describe(text);
		return this;
	}

	@Override
	public EnumSetting<E> group(String groupName) {
		super.group(groupName);
		return this;
	}

	@Override
	protected String toStringValue(E value) {
		return value.name();
	}

	@Override
	protected E parse(JsonPrimitive json) {
		if (!json.isString()) {
			return null;
		}
		String name = json.getAsString();
		for (E option : options) {
			if (option.name().equalsIgnoreCase(name)) {
				return option;
			}
		}
		return null;
	}
}
