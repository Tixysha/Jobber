import org.example.jobber.services.JobberService;

public class Main {

    public static void main(String[] args) {
        JobberService service = new JobberService();
        int count = service.calculate( 10000, 3000, 20000);
        System.out.println(count);
    }
}
