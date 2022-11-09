package convert;

public class MainCovertor {
    public static void main(String[] args) {
        Base64ToPdf base64ToPdf = new Base64ToPdf();
        System.out.println(base64ToPdf.convertBase64ToPdf("b64Token"));
    }
}
