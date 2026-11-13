package dev.f1client.auth;

import java.net.InetAddress;
import java.nio.file.Path;

/**
 * Derives the device-bound secret that locks {@code session.dat} to one machine.
 *
 * <p>The fingerprint mixes the OS name, CPU architecture, host name and the game
 * install path. It is not a ban identifier and never leaves the device.
 */
public final class DeviceFingerprint {
	private DeviceFingerprint() {
	}

	/**
	 * @param installDir the game directory the client runs from
	 * @return a stable fingerprint string for this device and install
	 */
	public static String compute(Path installDir) {
		return String.join("|",
				System.getProperty("os.name", "unknown"),
				System.getProperty("os.arch", "unknown"),
				hostName(),
				installDir.toAbsolutePath().normalize().toString());
	}

	private static String hostName() {
		String env = System.getenv("COMPUTERNAME");
		if (env == null || env.isBlank()) {
			env = System.getenv("HOSTNAME");
		}
		if (env != null && !env.isBlank()) {
			return env.trim();
		}
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (Exception e) {
			return "unknown-host";
		}
	}
}
