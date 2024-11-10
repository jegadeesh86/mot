package tej;

/**
 * Hello world!

/**
  * Hello world!
  */
public class App {
    public static void main(String[] args) {
        // Create a mobile photo object
        MobilePhoto photo = new MobilePhoto();
        photo.setResolution(3840, 2160); // 4K resolution
        photo.setFormat("JPEG");
        photo.setMetadata("Location", "Unknown");
        photo.setMetadata("Date", java.time.LocalDateTime.now().toString());
        photo.setMetadata("Device", "Mobile Phone");
        
        // Take the photo
        try {
            photo.capture();
            System.out.println("Photo captured successfully!");
            photo.save("mobile_photo.jpg");
        } catch (Exception e) {
            System.out.println("Failed to capture photo: " + e.getMessage());
        }
    }
}
