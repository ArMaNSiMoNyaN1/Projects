package arman.laptop;

public class Laptop {

        private String brand;
        private String color;
        private int releaseYear;
        private int screenSize;
        private Processor processor;
        private Ram ram;
        private VideoCard videoCard;

    public Laptop(String brand, String color, int releaseYear, int screenSize, Processor processor, Ram ram, VideoCard
        videoCard){
            this.brand = brand;
            this.color = color;
            this.releaseYear = releaseYear;
            this.screenSize = screenSize;
            this.processor = processor;
            this.ram = ram;
            this.videoCard = videoCard;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        public void setColor (String color){
            this.color = color;
        }

        public void setReleaseYear ( int releaseYear){
            this.releaseYear = releaseYear;
        }

        public void setScreenSize ( int screenSize){
            this.screenSize = screenSize;
        }

        public String getBrand () {
            return brand;
        }

        public String getColor () {
            return color;
        }

        public int getReleaseYear () {
            return releaseYear;
        }

        public int getScreenSize () {
            return screenSize;
        }

        public Processor getProcessor () {
            return processor;
        }

        public Ram ram () {
            return ram;
        }

        public VideoCard videoCard () {
            return videoCard;
        }

        public void setVideoCard (VideoCard videoCard){
            if (videoCard.isIntegrated())
                this.videoCard = videoCard;
        }

}
