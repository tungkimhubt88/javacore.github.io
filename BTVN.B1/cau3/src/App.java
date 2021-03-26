import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime currentDateTime = LocalDateTime.now(); // lấy ngày giờ hiện tại
        DateTimeFormatter currentFormatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yy"); // định dạng ngày giờ
        String formattedDate = currentDateTime.format(currentFormatter); // chuyển đổi
        System.out.println(formattedDate);
    }
}
