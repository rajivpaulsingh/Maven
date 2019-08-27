package qarajiv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        System.out.println("Command to create the maven project is:");
        System.out.println("mvn archetype:generate -DgroupId=com.rajiv -DartifactId=Mavenjava -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false");

        System.out.println("And then goto that project folder and make it compatible for intellij by running:");
        System.out.println("mvn idea:idea");
    }
}
