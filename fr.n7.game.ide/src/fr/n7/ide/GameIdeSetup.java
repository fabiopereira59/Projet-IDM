/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.GameRuntimeModule;
import fr.n7.GameStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GameIdeSetup extends GameStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GameRuntimeModule(), new GameIdeModule()));
	}
	
}