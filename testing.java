public class testing {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a test.");
        System.out.println("Testing, 1, 2, 3...");
        System.out.println("this is another change!");
    }
}

enum Season {
    WINTER("Cold"), SPRING("Warm"), SUMMER("Hot"), FALL("Cool");

    private String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
