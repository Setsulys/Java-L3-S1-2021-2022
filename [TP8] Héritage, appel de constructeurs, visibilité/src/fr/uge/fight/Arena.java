package fr.uge.fight;

public class Arena {

	
	public static Robot fight(Robot robot1, Robot robot2) {
		var challenger1 = robot1;
		var challenger2 = robot2;
		Robot tmp;
		while(!challenger1.isDead()) {
			if(challenger1.fire(challenger2)) {
				System.out.println(challenger2.toString() + " a ete touché par le " + challenger1.toString());
			}
			else {
				System.out.println(challenger1.toString() + " a manqué " + challenger2.toString());
			}
			if(!robot2.isDead()) {
				tmp = challenger1;
				challenger1 = challenger2;
				challenger2 = tmp;
			}
			else {
				return challenger1;
			}
		}
		return challenger2;
		/*while(true){*/
	}
}
