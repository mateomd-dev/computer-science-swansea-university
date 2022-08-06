/*
 * This version combines the force++ and println statements into one - the order of the components (force++) says that we
 * output the value of force *first* (because 'force' comes first) and increment it *last* (because ++ comes last).
 * Exercise: replace force++ with ++force and see what happens.
 * There is also a -- operator - try replacing ++ with --
 */
class Beaufort3 {
	public static void main(String[] args) {
		int force = 0;
		System.out.println("Force " + force++ + ": Calm. Smoke rises vertically.");
		System.out.println("Force " + force++ + ": Smoke drift indicates wind direction. Leaves and wind vanes are stationary.");
		System.out.println("Force " + force++ + ": Wind felt on exposed skin. Leaves rustle. Wind vanes begin to move.");
		System.out.println("Force " + force++ + ": Leaves and small twigs constantly moving, light flags extended.");
		System.out.println("Force " + force++ + ": Dust and loose paper raised. Small branches begin to move.");
		System.out.println("Force " + force++ + ": Branches of a moderate size move. Small trees in leaf begin to sway.");
		System.out.println("Force " + force++ + ": Large branches in motion. Whistling heard in overhead wires. Umbrella use becomes difficult. Empty plastic bins tip over.");
		System.out.println("Force " + force++ + ": Whole trees in motion. Effort needed to walk against the wind.");
		System.out.println("Force " + force++ + ": Some twigs broken from trees. Cars veer on road. Progress on foot is seriously impeded.");
		System.out.println("Force " + force++ + ": Some branches break off trees, and some small trees blow over. Construction/temporary signs and barricades blow over.");
		System.out.println("Force " + force++ + ": Trees are broken off or uprooted, structural damage likely");
		System.out.println("Force " + force++ + ": Widespread vegetation and structural damage likely.");
		System.out.println("Force " + force++ + ": Severe widespread damage to vegetation and structures. Debris and unsecured objects are hurled about.");
	}
}