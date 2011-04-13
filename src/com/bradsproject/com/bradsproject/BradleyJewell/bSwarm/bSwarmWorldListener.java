package com.bradsproject.BradleyJewell.bSwarm;

import org.bukkit.event.world.WorldEvent;
import org.bukkit.event.world.WorldListener;

public class bSwarmWorldListener extends WorldListener
{
	private final bSwarm plugin;
	
	public bSwarmWorldListener(bSwarm instance)
	{
		plugin = instance;
	}
	
	@Override
	public void onWorldLoad(WorldEvent event)
	{
		for(bSwarmTask task : plugin.tasks)
		{
			if(task.location.getWorld() == event.getWorld())
			{
				task.enabled = true;
			}
		}
	}
}
