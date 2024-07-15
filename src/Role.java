public enum Role {
    ADMIN("Администратор"),
    USER("Пользователь"),
    TEEN("Подросток");
    private String russianName;

    Role(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public void getRussianName(Person person) {
    }
}
