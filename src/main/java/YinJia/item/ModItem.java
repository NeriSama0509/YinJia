package YinJia.item;

import YinJia.YinJia;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,YinJia.MODID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    /*
        public static final RegistryObject<Item> 注册名 = ITEMS.register("物品名",
                ()->new Item(new Item.Properties().tab(任一创造模式选取栏)));
    */


    public  static void register(IEventBus eventBus){
            ITEMS.register(eventBus);
    }


}
