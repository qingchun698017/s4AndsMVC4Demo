package springMVC4.domain;

/**
 * DemoObj
 *
 * @author wqc
 * @create 2017-12-20 10:29
 **/
public class DemoObj {
    private Long id;

    private String name;

    public DemoObj(){
        super();
    }

    public DemoObj(Long id,String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
