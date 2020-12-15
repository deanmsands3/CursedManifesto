package net.rom95.manifesto.frontend.resource;

import net.swingonly.resources.ResourceAccessor.IAccessor;

public class Accessor implements IAccessor {

	@Override
	public Class<? extends IAccessor> get() {
		return this.getClass();
	}
}
