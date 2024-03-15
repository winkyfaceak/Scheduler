public class Category {
    private String categories;
    private String set;

    public Category (String categories){
        this.categories = categories;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String setSet(String set) {
        this.set = set;
        if (set.equals("-t")) {
            return "☑";

        } else if (set.equals("-x")) {
            return "◻";
        }else {
            return "◻";
        }
    }

    public String getSet() {
        return set;
    }
    @Override
    public String toString() {
        return categories;
    }
}
