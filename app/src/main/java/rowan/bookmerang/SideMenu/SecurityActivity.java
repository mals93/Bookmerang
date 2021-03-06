package rowan.bookmerang.SideMenu;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import rowan.bookmerang.Global.MainBaseActivity;
import rowan.bookmerang.R;

/**
 * Created by CHEONMYUNG on 2016-12-01.
 */

public class SecurityActivity extends MainBaseActivity {
    LinearLayout security_BackBtn;
    TextView tv_se;
    String security ="\"\n" +
            "개인정보 처리 방침\n" +
            "\n" +
            "('북메랑'이하 'ROWAN')은(는) 개인정보보호법에 따라 이용자의 개인정보 보호 및 권익을 보호하고 개인정보와 관련한 이용자의 고충을 원활하게 처리할 수 있도록 다음과 같은 처리방침을 두고 있습니다.\n" +
            "\n" +
            "('ROWAN') 은(는) 회사는 개인정보처리방침을 개정하는 경우 웹사이트 공지사항(또는 개별공지)을 통하여 공지할 것입니다.\n" +
            "\n" +
            "○ 본 방침은부터 2016년 12월 1일부터 시행됩니다.\n" +
            "\n" +
            "\n" +
            "1. 개인정보의 처리 목적 ('북메랑'이하 'ROWAN')은(는) 개인정보를 다음의 목적을 위해 처리합니다. 처리한 개인정보는 다음의 목적이외의 용도로는 사용되지 않으며 이용 목적이 변경될 시에는 사전동의를 구할 예정입니다.\n" +
            "\n" +
            "가. 홈페이지 회원가입 및 관리\n" +
            "\n" +
            "회원 가입의사 확인, 회원자격 유지·관리, 제한적 본인확인제 시행에 따른 본인확인 등을 목적으로 개인정보를 처리합니다.\n" +
            "\n" +
            "\n" +
            "나. 재화 또는 서비스 제공\n" +
            "\n" +
            "맞춤 서비스 제공 등을 목적으로 개인정보를 처리합니다.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2. 개인정보 파일 현황\n" +
            "('북메랑'이하 'ROWAN')가 개인정보 보호법 제32조에 따라 등록․공개하는 개인정보파일의 처리목적은 다음과 같습니다.\n" +
            "\n" +
            "1. 개인정보 파일명 : 회원 개인 정보\n" +
            "- 개인정보 항목 : 이메일, 휴대전화번호, 비밀번호, 로그인ID\n" +
            "- 수집방법 : 어플리케이션 회원가입\n" +
            "- 보유근거 : 정보주체의 동의\n" +
            "- 보유기간 : 3년\n" +
            "- 관련법령 :\n" +
            "\n" +
            "\n" +
            "\n" +
            "※ 기타('북메랑'이하 'ROWAN')의 개인정보파일 등록사항 공개는 행정안전부 개인정보보호 종합지원 포털(www.privacy.go.kr) → 개인정보민원 → 개인정보열람등 요구 → 개인정보파일 목록검색 메뉴를 활용해주시기 바랍니다.\n" +
            "\n" +
            "3. 개인정보의 처리 및 보유 기간\n" +
            "\n" +
            "① ('ROWAN')은(는) 법령에 따른 개인정보 보유·이용기간 또는 정보주체로부터 개인정보를 수집시에 동의 받은 개인정보 보유,이용기간 내에서 개인정보를 처리,보유합니다.\n" +
            "\n" +
            "② 각각의 개인정보 처리 및 보유 기간은 다음과 같습니다.\n" +
            "\n" +
            "1.홈페이지 회원가입 및 관리\n" +
            " (홈페이지 회원가입 및 관리)와 관련한 개인정보는 수집.이용에 관한 동의일로부터<3년>까지 위 이용목적을 위하여 보유.이용됩니다.\n" +
            "-보유근거 : 정보주체의 동의\n" +
            "-관련법령 : 대금결제 및 재화 등의 공급에 관한 기록 : 5년\n" +
            "-예외사유 :\n" +
            "\n" +
            "\n" +
            "\n" +
            "4. 개인정보의 제3자 제공에 관한 사항\n" +
            "\n" +
            "① ('북메랑'이하 'ROWAN')은(는) 정보주체의 동의, 법률의 특별한 규정 등 개인정보 보호법 제17조 및 제18조에 해당하는 경우에만 개인정보를 제3자에게 제공합니다.\n" +
            "\n" +
            "② ('북메랑')은(는) 다음과 같이 개인정보를 제3자에게 제공하고 있습니다.\n" +
            "\n" +
            "\n" +
            "1. <중고 교재 거래 상대>\n" +
            "- 개인정보를 제공받는 자 : 중고 교재 거래 상대\n" +
            "- 제공받는 자의 개인정보 이용목적 : 휴대전화번호\n" +
            "- 제공받는 자의 보유.이용기간: 지체없이 파기\n" +
            "\n" +
            "\n" +
            "\n" +
            "5. 개인정보처리 위탁\n" +
            "\n" +
            "① ('ROWAN')은(는) 원활한 개인정보 업무처리를 위하여 다음과 같이 개인정보 처리업무를 위탁하고 있습니다.\n" +
            "\n" +
            "② ('북메랑'이하 'ROWAN')은(는) 위탁계약 체결시 개인정보 보호법 제25조에 따라 위탁업무 수행목적 외 개인정보 처리금지, 기술적․관리적 보호조치, 재위탁 제한, 수탁자에 대한 관리․감독, 손해배상 등 책임에 관한 사항을 계약서 등 문서에 명시하고, 수탁자가 개인정보를 안전하게 처리하는지를 감독하고 있습니다.\n" +
            "\n" +
            "③ 위탁업무의 내용이나 수탁자가 변경될 경우에는 지체없이 본 개인정보 처리방침을 통하여 공개하도록 하겠습니다.\n" +
            "\n" +
            "\n" +
            "6. 정보주체의 권리,의무 및 그 행사방법 이용자는 개인정보주체로서 다음과 같은 권리를 행사할 수 있습니다.\n" +
            "\n" +
            "① 정보주체는 ROWAN(‘북메랑’이하 ‘ROWAN) 에 대해 언제든지 다음 각 호의 개인정보 보호 관련 권리를 행사할 수 있습니다.\n" +
            "1. 개인정보 열람요구\n" +
            "2. 오류 등이 있을 경우 정정 요구\n" +
            "3. 삭제요구\n" +
            "4. 처리정지 요구\n" +
            "② 제1항에 따른 권리 행사는ROWAN(‘북메랑’이하 ‘ROWAN) 에 대해 개인정보 보호법 시행규칙 별지 제8호 서식에 따라 서면, 전자우편, 모사전송(FAX) 등을 통하여 하실 수 있으며 <기관/회사명>(‘사이트URL’이하 ‘사이트명) 은(는) 이에 대해 지체 없이 조치하겠습니다.\n" +
            "③ 정보주체가 개인정보의 오류 등에 대한 정정 또는 삭제를 요구한 경우에는 <기관/회사명>(‘사이트URL’이하 ‘사이트명) 은(는) 정정 또는 삭제를 완료할 때까지 당해 개인정보를 이용하거나 제공하지 않습니다.\n" +
            "④ 제1항에 따른 권리 행사는 정보주체의 법정대리인이나 위임을 받은 자 등 대리인을 통하여 하실 수 있습니다. 이 경우 개인정보 보호법 시행규칙 별지 제11호 서식에 따른 위임장을 제출하셔야 합니다.\n" +
            "\n" +
            "\n" +
            "\n" +
            "7. 처리하는 개인정보의 항목 작성\n" +
            "\n" +
            "① ('북메랑'이하 'ROWAN')은(는) 다음의 개인정보 항목을 처리하고 있습니다.\n" +
            "\n" +
            "1 (제화 또는 서비스 제공)\n" +
            "- 필수항목 : 이메일, 휴대전화번호, 비밀번호, 로그인ID\n" +
            "- 선택항목 :\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "8. 개인정보의 파기('ROWAN')은(는) 원칙적으로 개인정보 처리목적이 달성된 경우에는 지체없이 해당 개인정보를 파기합니다. 파기의 절차, 기한 및 방법은 다음과 같습니다.\n" +
            "\n" +
            "-파기절차이용자가 입력한 정보는 목적 달성 후 별도의 DB에 옮겨져(종이의 경우 별도의 서류) 내부 방침 및 기타 관련 법령에 따라 일정기간 저장된 후 혹은 즉시 파기됩니다. 이 때, DB로 옮겨진 개인정보는 법률에 의한 경우가 아니고서는 다른 목적으로 이용되지 않습니다.-파기기한이용자의 개인정보는 개인정보의 보유기간이 경과된 경우에는 보유기간의 종료일로부터 5일 이내에, 개인정보의 처리 목적 달성, 해당 서비스의 폐지, 사업의 종료 등 그 개인정보가 불필요하게 되었을 때에는 개인정보의 처리가 불필요한 것으로 인정되는 날로부터 5일 이내에 그 개인정보를 파기합니다.\n" +
            "\n" +
            "-파기방법\n" +
            "전자적 파일 형태의 정보는 기록을 재생할 수 없는 기술적 방법을 사용합니다.\n" +
            "\n" +
            "\n" +
            "\n" +
            "9. 개인정보의 안전성 확보 조치 ('ROWAN')은(는) 개인정보보호법 제29조에 따라 다음과 같이 안전성 확보에 필요한 기술적/관리적 및 물리적 조치를 하고 있습니다.\n" +
            "\n" +
            "1. 개인정보 취급 직원의 최소화 및 교육\n" +
            "개인정보를 취급하는 직원을 지정하고 담당자에 한정시켜 최소화 하여 개인정보를 관리하는 대책을 시행하고 있습니다.\n" +
            "\n" +
            "2. 개인정보의 암호화\n" +
            "이용자의 개인정보는 비밀번호는 암호화 되어 저장 및 관리되고 있어, 본인만이 알 수 있으며 중요한 데이터는 파일 및 전송 데이터를 암호화 하거나 파일 잠금 기능을 사용하는 등의 별도 보안기능을 사용하고 있습니다.\n" +
            "\n" +
            "3. 개인정보에 대한 접근 제한\n" +
            "개인정보를 처리하는 데이터베이스시스템에 대한 접근권한의 부여,변경,말소를 통하여 개인정보에 대한 접근통제를 위하여 필요한 조치를 하고 있으며 침입차단시스템을 이용하여 외부로부터의 무단 접근을 통제하고 있습니다.\n" +
            "\n" +
            "4. 문서보안을 위한 잠금장치 사용\n" +
            "개인정보가 포함된 서류, 보조저장매체 등을 잠금장치가 있는 안전한 장소에 보관하고 있습니다.\n" +
            "\n" +
            "5. 비인가자에 대한 출입 통제\n" +
            "개인정보를 보관하고 있는 물리적 보관 장소를 별도로 두고 이에 대해 출입통제 절차를 수립, 운영하고 있습니다.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "10. 개인정보 보호책임자 작성\n" +
            "\n" +
            "\n" +
            "① ROWAN(‘북메랑’이하 ‘ROWAN) 은(는) 개인정보 처리에 관한 업무를 총괄해서 책임지고, 개인정보 처리와 관련한 정보주체의 불만처리 및 피해구제 등을 위하여 아래와 같이 개인정보 보호책임자를 지정하고 있습니다.\n" +
            "\n" +
            "▶ 개인정보 보호책임자\n" +
            "성명 :박천명\n" +
            "직책 :Creative Devloper\n" +
            "직급 :사원\n" +
            "연락처 :010-3254-4483, mals93@creativerowan.com,\n" +
            "※ 개인정보 보호 담당부서로 연결됩니다.\n" +
            "\n" +
            "▶ 개인정보 보호 담당부서\n" +
            "부서명 :\n" +
            "담당자 :\n" +
            "연락처 :, ,\n" +
            "② 정보주체께서는 ROWAN(‘북메랑’이하 ‘ROWAN) 의 서비스(또는 사업)을 이용하시면서 발생한 모든 개인정보 보호 관련 문의, 불만처리, 피해구제 등에 관한 사항을 개인정보 보호책임자 및 담당부서로 문의하실 수 있습니다. ROWAN(‘북메랑’이하 ‘ROWAN) 은(는) 정보주체의 문의에 대해 지체 없이 답변 및 처리해드릴 것입니다.\n" +
            "\n" +
            "\n" +
            "\n" +
            "11. 개인정보 처리방침 변경\n" +
            "\n" +
            "①이 개인정보처리방침은 시행일로부터 적용되며, 법령 및 방침에 따른 변경내용의 추가, 삭제 및 정정이 있는 경우에는 변경사항의 시행 7일 전부터 공지사항을 통하여 고지할 것입니다.\"";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        security_BackBtn = (LinearLayout) findViewById(R.id.security_BackBtn);
        tv_se = (TextView) findViewById(R.id.tv_se);
        tv_se.setText(security);
        if (Build.VERSION.SDK_INT >= 21) {   //상태바 색
            getWindow().setStatusBarColor(Color.parseColor("#1E88E5"));
        }

        security_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.slide_right, R.anim.slide_out_right);
        finish();
    }
}
