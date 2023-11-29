package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.bottomnav.R

class FragmentAndroid : Fragment() {

    private lateinit var webView: WebView
    private lateinit var gitbtn: Button
    private lateinit var textView: TextView
    private lateinit var tenkibtn: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_android, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Viewの取得
        webView = view.findViewById(R.id.WV1)
        gitbtn = view.findViewById(R.id.gitbtn)
        textView = view.findViewById(R.id.textView)
        tenkibtn = view.findViewById(R.id.tenkibtn)


        // ボタンクリック時の処理.gitbtn
        gitbtn.setOnClickListener {
            webView.settings.javaScriptEnabled = true
            webView.loadUrl("https://github.com/7aso?tab=repositories")

            // TextViewとButtonを非表示にする
            textView.visibility = View.GONE
            gitbtn.visibility = View.GONE
            tenkibtn.visibility = View.GONE
        }
        // ボタンクリック時の処理.tenkibtn
        tenkibtn.setOnClickListener {
            webView.settings.javaScriptEnabled = true
            webView.loadUrl("https://www.jma.go.jp/bosai/rain/rain.html")

            // TextViewとButtonを非表示にする
            textView.visibility = View.GONE
            gitbtn.visibility = View.GONE
            tenkibtn.visibility = View.GONE
        }
    }
    override fun onResume() {
        super.onResume()

        // Fragmentが再度表示された際にWebViewをリセットする（空のページを読み込む）
        webView.loadUrl("about:blank")
        // Fragmentが再表示されるたびにTextViewとButtonを再表示する
        textView.visibility = View.VISIBLE
        gitbtn.visibility = View.VISIBLE
        tenkibtn.visibility = View.VISIBLE

    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentAndroid()
    }
}

