package models.Award;

public enum CategoriesType {
    DIRECTOR("Best Director"),
    MOVIE("Best Movie"),
    ACTOR("Best leading actor"),
    SUPORTIVEACTOR("Best support actor"),
    SCRIPT("Best original script");

    private String description;

    CategoriesType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
