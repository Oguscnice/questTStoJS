// export class Photo {
//     url:string;
//     filename:string;
//     width: number;
//     height: number;
// }

public class Photo {
    private String url;
    private String filename;
    private double width;
    private double height;

    public Photo(String url, String filename, double width, double height) {
    this.url = url;
    this.filename = filename;
    this.width = width;
    this.height = height;
    }
}