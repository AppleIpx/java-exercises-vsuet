package fifthHomework.calculator;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class Rhino {
    public static Object CalculatingString(String script) {
        // Создание контекста и глобального объекта для Rhino
        Context context = Context.enter();
        Scriptable scope = context.initStandardObjects();
        try {
            // Выполнение JavaScript-кода с помощью Rhino
            Object result = context.evaluateString(scope, script, "<cmd>", 1, null);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Context.exit();
        }
        return -0;
    }
}
