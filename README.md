# SteelCrafting

[LICENSE](LICENSE.md)

[CurseForge](https://www.curseforge.com/minecraft/mc-mods/steelcrafting) Direct download of the jar.

**SteelCrafting** is a Fabric mod that adds steel tools and armor, crafted from steel ingots obtained by blasting iron ingots.

## Items

### Steel Ingot

![Steel Ingot Recipe](images/blasting_steel.png)

Steel ingots are the base material for all steel tools and armor.
Obtain by blasting iron ingots in a blast furnace for a long time. 


## Tools

**Steel tools** are as strong and **as fast as iron tools** but have the **durability of diamond.**

- **Steel Sword**  
- **Steel Pickaxe**  
- **Steel Axe**  
- **Steel Shovel**  
- **Steel Hoe**  


![Steel Tool Recipe](images/crafting_axe.png)


## Armor

**Steel armor** offers the same **protection as iron armor** but has the **durability of diamond.**

- **Steel Helmet**  
- **Steel Chestplate**  
- **Steel Leggings**  
- **Steel Boots**  


![Steel Armor Recipe](images/crafting_chesplate.png)

## Blocks

- **Steel Block**  
  A decorative and building block crafted from nine steel ingots.

- **Steel Pressure Plate**  
  Heavy counting pressure plate.
  Different from the vanilla weighted pressure plate, counting pressure plates do not only count the number of entities, but actually counts the number of items that are dropped on the pressure plate. This is way more useful for redstone control. This one actives one redstone signal per 16 items. Sarting with a signal at 16 items, not 1 like the vanilla weighted pressure plate.
 +For a light counting pressure plate, you can soon use my CopperCrafting mod, which will include a counting pressure plate, that counts each item individually.*
 
  ![Steel Pressure Plate Recipe](images/crafting_pressure_plate.png)


## Other Recipes


- **Bucket Crafting**  
  Craft two **buckets** using three **steel ingots** in the same pattern as the vanilla bucket recipe.  

- **Improved Flint and Steel**  
  Craft a **Flint and Steel** using **flint** and a **steel ingot** (flint above steel ingot).  
  This tool works like the vanilla flint and steel, but has **4x the durability (256 uses)**.
  
- **Rail Crafting**  
  Craft **24 rails** using **steel ingots** and **logs**.
  The vanilla recipe using sticks and iron creates 16 rails.

## Repairing Steel Tools and Armor

Steel tools and armor can be repaired using steel ingots. The repair mechanics are integrated with vanilla methods, allowing for repairs in an anvil or through crafting. This is enabled by custom item tags `repairs_steel_tool` and `repairs_steel_armor`.

## Installation

The compiled mod JAR can be found in the `build/libs/` directory of this repository after running the build task.

1. Download the mod version you need for your minecraft version.
2. Ensure you have the matching verison of the fabric installed and have a profile for it.
3. Place the JAR into the `mods` folder of your Minecraft instance.  
4. Launch Minecraft with the Fabric profile. 