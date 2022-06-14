spring-starter dome


1，打包，部署到仓库
如果是本地的话，直接通过mvn install命令就可以了。
如果需要部署到公司的仓库话，这个就不说了。 
2，新建一个新的SpringBoot项目引入我们刚写的starter

        <dependency>
           <groupId>org.example</groupId>
           <artifactId>csh-springboot-starter</artifactId>
           <version>1.0-SNAPSHOT</version>
       </dependency>
3,在启动了加EnableMsg
@SpringBootApplication
@EnableMsg
public class TestStarter {
public static void main(String[] args) {
ConfigurableApplicationContext applicationContext = SpringApplication.run(TestStarter.class, args);
AliMsg aliyunSmsSender = applicationContext.getBean(AliMsg.class);
aliyunSmsSender.send("用阿里云发送短信");
TxMsg tencentSmsSender = applicationContext.getBean(TxMsg.class);
tencentSmsSender.send("用腾讯云发送短信");
}
