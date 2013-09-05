package gh.example.jsfapp;

import javax.inject.Inject;

import org.jboss.forge.shell.ShellPrompt;
import org.jboss.forge.shell.plugins.Alias;
import org.jboss.forge.shell.plugins.Command;
import org.jboss.forge.shell.plugins.Option;
import org.jboss.forge.shell.plugins.PipeOut;
import org.jboss.forge.shell.plugins.Plugin;

@Alias("JSFAppPlugin")
public class JSFAppPlugin implements Plugin {

	@Inject
	private ShellPrompt prompt;

	@Command("run")
	public void run(PipeOut out, @Option(name = "value") final String arg) {
		out.println("Executed command with value: " + arg);
	}

}
