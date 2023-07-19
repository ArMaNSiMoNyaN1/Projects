package arman.sport;

public class Sport {
    public class sport {
        public String sportName;
        public SportRu[] ru;
        public SportDress sportDress;
        public String place;
        public String endResult;
        public Human referee;
        public boolean IsTeaSport;
        public SportTeam[] teams;
        public Sportsmen[] sportsmen;

        public sport(String sportName, SportRu[] ru, String place, String endResult, boolean isTeaSport) {
            this.sportName = sportName;
            this.ru = ru;
            this.place = place;
            this.endResult = endResult;
            IsTeaSport = isTeaSport;
        }
    }




































}
