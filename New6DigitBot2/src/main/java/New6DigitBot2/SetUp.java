/**
 * 
 */

package New6DigitBot2;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;

/**
 * @author OtakuPug
 *
 */
public class SetUp extends ListenerAdapter{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws LoginException
    {
        new JDABuilder("NjM1OTY0NTU1Mzg5OTYwMjIz.XknNJA.uitIt1G2HIPJ5po3pVkT2oIs7nk")
            .addEventListeners(new bot())            
            .setActivity(Activity.playing("mhelp"))
            
            .build();
    }

}
