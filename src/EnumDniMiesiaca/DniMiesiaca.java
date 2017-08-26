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
        LUTY("MARZEC") {
            public DniMies next() {
                return MARZEC;
            }
        },
        MARZEC("KWIECIEN") {
            public DniMies next() {
                return KWIECIEN;
            }
        },
        KWIECIEN("MAJ") {
            public DniMies next() {
                return MAJ;
            }
        },
        MAJ("CZERWIEC") {
            public DniMies next() {
                return CZERWIEC;
            }
        },
        CZERWIEC("LIPIEC") {
            public DniMies next() {
                return LIPIEC;
            }
        },
        LIPIEC("SIERPIEN") {
            public DniMies next() {
                return SIERPIEN;
            }
        },
        SIERPIEN("WRZESIEN") {
            public DniMies next() {
                return WRZESIEN;
            }
        },
        WRZESIEN("PAZDZIERNIK") {
            public DniMies next() {
                return PAZDZIERNIK;
            }
        },
        PAZDZIERNIK("LISTOPAD") {
            public DniMies next() {
                return LISTOPAD;
            }
        },
        LISTOPAD("GRUDZIEN") {
            public DniMies next() {
                return GRUDZIEN;
            }
        },
        GRUDZIEN("STYCZEN") {
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