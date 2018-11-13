package WiringBeans.withJava;

import WiringBeans.sharedlibrary.CDPlayer;
import WiringBeans.sharedlibrary.CompactDisc;
import WiringBeans.sharedlibrary.FromTheInside;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerJavaConfig {

    @Bean
    public CompactDisc frTheInside(){
        return new FromTheInside();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(frTheInside());
    }


}
