import java.util.Base64;

public class UrlBase64 {
    public static void main(String[] args) {
        String url = "https://github.com/ibkhong9587-code/banca";
        String encoded = Base64.getEncoder().encodeToString(url.getBytes());
        System.out.println(encoded);
    }
}
