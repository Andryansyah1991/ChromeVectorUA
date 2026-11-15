package id.cocoeyon.chromevectorua;

import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;

public final class ChromeVectorModule extends XposedModule {
    @Override
    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam param) {
        super.onPackageLoaded(param);
        if ("com.android.chrome".equals(param.getPackageName())) {
            log("ChromeVectorUA loaded in com.android.chrome. UA hooks are not implemented yet.");
        }
    }
}
