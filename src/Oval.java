class Oval extends Shape {
    private String name;

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String getName(){
        return setName("Овал");
    }
}
