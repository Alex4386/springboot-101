package me.alex4386.gachon.sw14856.week02;

public class Scalar {
    public static String generateScalarDocs(String endpoint) {
        return "<!doctype html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>Scalar API Reference</title>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta\n" +
                "      name=\"viewport\"\n" +
                "      content=\"width=device-width, initial-scale=1\" />\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <!-- Need a Custom Header? Check out this example: https://codepen.io/scalarorg/pen/VwOXqam -->\n" +
                "    <script\n" +
                "      id=\"api-reference\"\n" +
                "      data-url=\""+endpoint+"\"></script>\n" +
                "\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/@scalar/api-reference\"></script>\n" +
                "  </body>\n" +
                "</html>";
    }
}
