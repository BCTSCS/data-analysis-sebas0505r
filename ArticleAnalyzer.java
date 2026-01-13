public class ArticleAnalyzer {
    private String link;
    private String headline;
    private String category;
    private String description;
    private String author;
    private String date;

    public ArticleAnalyzer(String author, String category, String date, String description, String headline, String link) {
        this.author = author;
        this.category = category;
        this.date = date;
        this.description = description;
        this.headline = headline;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public String getHeadline() {
        return headline;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArticleAnalyzer{");
        sb.append("link=").append(link);
        sb.append(", headline=").append(headline);
        sb.append(", category=").append(category);
        sb.append(", description=").append(description);
        sb.append(", author=").append(author);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
