package android.code.editor.files.utils;

import android.code.editor.R;
import android.content.Context;
import android.widget.ImageView;

import java.io.File;

public class FileIcon {
    public static void setUpIcon(Context context, String path, ImageView imageview) {
        if (new File(path).isDirectory()) {
            imageview.setImageResource(R.drawable.ic_folder_black_24dp);
        } else if (new File(path).isFile()) {
            if (FileManager.ifFileFormatIsEqualTo(path, "java")) {
                imageview.setImageResource(R.drawable.ic_language_java);
            } else if (FileManager.ifFileFormatIsEqualTo(path, "html")) {
                imageview.setImageResource(R.drawable.language_html);
            } else {
                imageview.setImageResource(0);
            }
        }
    }
}
