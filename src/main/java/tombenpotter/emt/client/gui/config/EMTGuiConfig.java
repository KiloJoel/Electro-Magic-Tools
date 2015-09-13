package tombenpotter.emt.client.gui.config;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import tombenpotter.emt.ModInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static tombenpotter.emt.common.util.ConfigHandler.*;

public class EMTGuiConfig extends GuiConfig {

    public EMTGuiConfig(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), ModInformation.modid, false, false, StatCollector.translateToLocal("gui." + ModInformation.modid + ".config.title"));
    }

    @SuppressWarnings("rawtypes")
    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        list.add(new ConfigElement<ConfigCategory>(config.getCategory(CATEGORY_RANDOM.toLowerCase(Locale.US))));
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(CATEGORY_VALUES.toLowerCase(Locale.US))));
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(CATEGORY_RESEARCH.toLowerCase(Locale.US))));
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(CATEGORY_OUTPUTS.toLowerCase(Locale.US))));

        return list;
    }
}
