package abstracts;

public abstract class Tools implements Thingsable{
    private String tool_name;

    public Tools(String name) {
        this.tool_name = name;
    }
    @Override
    public String getName() {
        return tool_name;
    }
}
