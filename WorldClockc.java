public class WorldClockc extends clock {
        int timeZone = 0;
      
        public WorldClockc(int timeZone) {
          super();
          this.timeZone = timeZone;
      
        }
      
        public String getHours() {
          String hours = String.valueOf(Integer.parseInt(super.getHours()) + timeZone);
          return hours;
        }
      }
    

