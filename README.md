# SteelCrafting

[LICENSE](LICENSE.md)

[CurseForge](https://www.curseforge.com/minecraft/mc-mods/steelcrafting) Direct download of the jar.

**SteelCrafting** is a Fabric mod that adds steel tools and armor, crafted from steel ingots obtained by blasting iron ingots.

## Items

### **Steel Ingot**

![Steel Ingot Recipe](images/blasting_steel.png)

**Steel ingots** are the base material for all steel tools and armor.
Obtain by blasting iron ingots in a blast furnace for a long time. 


### **Improved Flint and Steel**  
Craft a **Flint and Steel** using **flint** and a **steel ingot** (flint above steel ingot).  
This tool works like the vanilla flint and steel, but has **4x the durability (256 uses)**.


## Blocks

### **Steel Block**  
A decorative and building block crafted from nine steel ingots.

### **Heavy Counting Pressure Plate**  

  This pressure plate is a bit different from the vanilla pressure plate, as it **counts each item** on it, not each entity.
  This means items in stacks are correctly counted.

  > Outputs **one** redstone signal for each **16 items**/entity on the pressure plate.


## Tools

**Steel tools** can mine the same things and have the same mining speed as **iron** tools.

**Steel tools** are **4 times** as durable as iron tools, which is about 2/3 of diamond tools.

**Steel tools** sit between iron and diamond tools in terms of enchantability.


| Material   | Durability | Mining Speed | Damage Bonus | Enchantability |
|------------|------------|--------------|---------------------|----------------|
| Gold       | 32         | 12.0         | 0.0                 | 22             |
| Wood       | 59         | 2.0          | 0.0                 | 15             |
| Stone      | 131        | 4.0          | 1.0                 | 5              |
| Iron       | 250        | 6.0          | 2.0                 | 14             |
| **Steel**  | **1000**   | **6.0**      | **2.0**             | **12**         |
| Diamond    | 1561       | 8.0          | 3.0                 | 10             |




![Steel Tool Recipe](images/crafting_axe.png)


## Armor

**Steel armor** offers the same **protection as iron armor**.

**Steel armor** has **twice** the durability iron, which is slightly less than diamond.

**Steel armor** have the same enchantability as diamond.
 

### ***Protection, Durability, Enchantability***

| Material  | Head | Chest | Legs | Feet | Total | Durability | Enchantability |
|-----------|------|-------|------|------|-------|------------|----------------|
| Leather   | 1    | 3     | 2    | 1    | 7     | 5          | 15             |
| Gold      | 2    | 5     | 3    | 1    | 11    | 7          | 25             |
| Iron      | 2    | 6     | 5    | 2    | 15    | 15         | 9              |
| **Steel** | **2**| **6** | **5**| **2**|**15** | **30**     | **10**         |
| Diamond   | 3    | 8     | 6    | 3    | 20    | 33         | 10             |

![Steel Armor Recipe](images/crafting_chesplate.png)

## Other Recipes


- **Bucket Crafting**  
Craft two **buckets** using three **steel ingots** in the same pattern as the vanilla bucket recipe.  

  
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