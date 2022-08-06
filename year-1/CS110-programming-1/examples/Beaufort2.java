/*
 * To illustrate the ++ operator, we've replaced the actual number in the text and calculate it - adding one using ++ each time
 */
class Beaufort2 {
	public static void main(String[] args) {
		int force = 0;
		System.out.println("Force " + force + ": Calm. Smoke rises vertically.");
		force++;
		System.out.println("Force " + force + ": Smoke drift indicates wind direction. Leaves and wind vanes are stationary.");
		force++;
		System.out.println("Force " + force + ": Wind felt on exposed skin. Leaves rustle. Wind vanes begin to move.");
		force++;
		System.out.println("Force " + force + ": Leaves and small twigs constantly moving, light flags extended.");
		force++;
		System.out.println("Force " + force + ": Dust and loose paper raised. Small branches begin to move.");
		force++;
		System.out.println("Force " + force + ": Branches of a moderate size move. Small trees in leaf begin to sway.");
		force++;
		System.out.println("Force " + force + ": Large branches in motion. Whistling heard in overhead wires. Umbrella use becomes difficult. Empty plastic bins tip over.");
		force++;
		System.out.println("Force " + force + ": Whole trees in motion. Effort needed to walk against the wind.");
		force++;
		System.out.println("Force " + force + ": Some twigs broken from trees. Cars veer on road. Progress on foot is seriously impeded.");
		force++;
		System.out.println("Force " + force + ": Some branches break off trees, and some small trees blow over. Construction/temporary signs and barricades blow over.");
		force++;
		System.out.println("Force " + force + ": Trees are broken off or uprooted, structural damage likely");
		force++;
		System.out.println("Force " + force + ": Widespread vegetation and structural damage likely.");
		force++;
		System.out.println("Force " + force + ": Severe widespread damage to vegetation and structures. Debris and unsecured objects are hurled about.");
	}
}