package test.activity;

import me.xiaopan.androidlibrary.R;
import android.os.Bundle;
import test.MyBaseActivity;

/**
 * 自定义文本编辑器
 * @author xiaopan
 *
 */
public class CustomEditTextActivity extends MyBaseActivity {

	@Override
	protected void onInitLayout(Bundle savedInstanceState) {
		setContentView(R.layout.custom_edit_text);
	}

	@Override
	protected void onInitListener(Bundle savedInstanceState) {
		
	}

	@Override
	protected void onInitData(Bundle savedInstanceState) {
		
	}
}