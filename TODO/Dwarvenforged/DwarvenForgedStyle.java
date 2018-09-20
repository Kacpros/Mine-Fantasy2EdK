package minefantasy.mf2.item.list.styles;

import minefantasy.mf2.api.armour.ArmourDesign;
import minefantasy.mf2.api.crafting.exotic.SpecialForging;
import minefantasy.mf2.item.archery.EnumBowType;
import minefantasy.mf2.item.archery.ItemBowMF;
import minefantasy.mf2.item.armour.ItemCustomArmour;
import minefantasy.mf2.item.list.CreativeTabMF;
import minefantasy.mf2.item.list.CustomArmourListMF;
import minefantasy.mf2.item.list.CustomToolListMF;
import minefantasy.mf2.item.tool.ItemAxeMF;
import minefantasy.mf2.item.tool.ItemHoeMF;
import minefantasy.mf2.item.tool.ItemPickMF;
import minefantasy.mf2.item.tool.ItemShearsMF;
import minefantasy.mf2.item.tool.ItemSpadeMF;
import minefantasy.mf2.item.tool.advanced.ItemHandpick;
import minefantasy.mf2.item.tool.advanced.ItemHvyPick;
import minefantasy.mf2.item.tool.advanced.ItemHvyShovel;
import minefantasy.mf2.item.tool.advanced.ItemLumberAxe;
import minefantasy.mf2.item.tool.advanced.ItemMattock;
import minefantasy.mf2.item.tool.advanced.ItemScythe;
import minefantasy.mf2.item.tool.advanced.ItemTrowMF;
import minefantasy.mf2.item.tool.crafting.ItemHammer;
import minefantasy.mf2.item.tool.crafting.ItemKnifeMF;
import minefantasy.mf2.item.tool.crafting.ItemNeedle;
import minefantasy.mf2.item.tool.crafting.ItemSaw;
import minefantasy.mf2.item.tool.crafting.ItemSpanner;
import minefantasy.mf2.item.tool.crafting.ItemTongs;
import minefantasy.mf2.item.weapon.ItemBattleaxeMF;
import minefantasy.mf2.item.weapon.ItemDagger;
import minefantasy.mf2.item.weapon.ItemGreatswordMF;
import minefantasy.mf2.item.weapon.ItemHalbeardMF;
import minefantasy.mf2.item.weapon.ItemKatanaMF;
import minefantasy.mf2.item.weapon.ItemLance;
import minefantasy.mf2.item.weapon.ItemMaceMF;
import minefantasy.mf2.item.weapon.ItemSpearMF;
import minefantasy.mf2.item.weapon.ItemSwordMF;
import minefantasy.mf2.item.weapon.ItemWaraxeMF;
import minefantasy.mf2.item.weapon.ItemWarhammerMF;
import minefantasy.mf2.item.weapon.ItemWeaponMF;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class DwarvenForgedStyle {
    public static ToolMaterial dwarvenforged = EnumHelper.addToolMaterial("dwarvenforged", 2, 225, 5.5F, 1.5F, 12);

    public static ItemWeaponMF dwarvenforged_longsword;
    
    public static ItemPickMF dwarvenforged_pick;




    public static void load() {
        String design = "dwarvenforged";
        CreativeTabs tab = CreativeTabMF.tabDwarvenforged;
        ToolMaterial mat = dwarvenforged;
        float ratingMod = 1.2F;

        
        dwarvenforged_longsword = new ItemSwordMF(design + "_longsword", mat, 0, 1F).setCustom(design).setTab(tab)
                .modifyBaseDamage(1);
   

        // Tools
        dwarvenforged_pick = (ItemPickMF) new ItemPickMF(design + "_pick", mat, 0).setCustom(design).setCreativeTab(tab);
        

        // Crafters
       

 
    }

    public static void loadCrafting() {

    }
}
