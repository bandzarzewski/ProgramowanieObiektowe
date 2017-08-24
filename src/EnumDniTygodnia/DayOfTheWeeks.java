package EnumDniTygodnia;

/**
 * Created by RENT on 2017-08-24.
 */
public class DayOfTheWeeks {
    public enum Days {
        MONDAY("PONIEDZIALEK") {
            public Days next() {
                return FRIDAY;
            }
        },
        FRIDAY("PIATEK") {
            public Days next() {
                return SUNDAY;
            }
        },
        SUNDAY("NIEDZIELA") {
            public Days next() {
                return MONDAY;
            }
        };
        public final String name;

        Days(String name) {
            this.name = name;
        }//Konstruktor

        String getName() {
            return name;
        }

        public abstract Days next();
    }

    public static void main(String[] args) {
        for (Days days : Days.values()) {
            System.out.printf("%s : polska nazwa %s następny dzien to %s \n", days, days.getName(), days.next());
        }

    }
}
