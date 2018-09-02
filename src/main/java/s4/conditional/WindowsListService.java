package s4.conditional;

/**
 * WindowsListService
 *
 * @author wqc
 * @create 2017-12-18 14:51
 **/
public class WindowsListService implements ListService {
    public String showListCmd() {
        return "dir";
    }
}
