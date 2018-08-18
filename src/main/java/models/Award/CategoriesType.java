package models.Award;

public enum CategoriesType {
    DIRECTOR("Best Director"),
    MOVIE("Best Movie"),
    ACTOR("Best leading actor"),
    SUPORTIVEACTOR("Best suportive actor"),
    SCRIPT("Best orignial script");

    private String description;

    CategoriesType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
