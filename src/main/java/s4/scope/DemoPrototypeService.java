package s4.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Scope-Prototype
 *
 * @author wqc
 * @create 2017-12-06 9:38
 **/
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
