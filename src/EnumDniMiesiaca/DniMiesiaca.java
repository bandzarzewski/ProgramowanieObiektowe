package EnumDniMiesiaca;

/**
 * Created by RENT on 2017-08-24.
 */
public class DniMiesiaca {
    public enum DniMies {
        STYCZEN("LUTY") {
            public DniMies next() {
                return LUTY;
            }
        },
        LUTY("STYCZEN") {
            public DniMies next() {
                return STYCZEN;
            }
        };

        public final String name;

        DniMies(String name) {
            this.name = name;
        }

        public abstract DniMies next();
    }

    public static void main(String[] args) {
        for (DniMies dnimiesiaca : DniMies.values()) {
            System.out.printf("%s nastepny miesiac %s \n", dnimiesiaca, dnimiesiaca.next());
        }
    }

}