import android.widget.Button;
import  android.widget.EditText;
import  android.widget.Toast;

public class MainActivityextends AppCompatActivity {

EditTextn1,n2,an;
    Button a,s,m,d,e;
double ans=0;


@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
n1 = findViewById(R.id.editText);
n2 = findViewById(R.id.editText2);

a = findViewById(R.id.button3);
m = findViewById(R.id.button);
d = findViewById(R.id.button4);
s = findViewById(R.id.button2);
e = findViewById(R.id.button5);
an = findViewById(R.id.editText3);

a.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
                String num1 = n1.getText().toString();
                String num2 = n2.getText().toString();
if (num1.isEmpty() || num2.isEmpty()) {
Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
else {
double a = Double.parseDouble(n1.getText().toString());
double b = Double.parseDouble(n2.getText().toString());
ans= a + b;
                }
            }
        });
s.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
                String num1 = n1.getText().toString();
                String num2 = n2.getText().toString();
if (num1.isEmpty() || num2.isEmpty()) {
Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
else {
double a = Double.parseDouble(n1.getText().toString());
double b = Double.parseDouble(n2.getText().toString());
ans= a - b;
                }
            }
        });
m.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
                String num1 = n1.getText().toString();
                String num2 = n2.getText().toString();
if (num1.isEmpty() || num2.isEmpty()) {
Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
else {
double a = Double.parseDouble(n1.getText().toString());
double b = Double.parseDouble(n2.getText().toString());
ans= a * b;
                }
            }
        });
d.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
                String num1 = n1.getText().toString();
                String num2 = n2.getText().toString();
if (num1.isEmpty() || num2.isEmpty()) {
Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
else {
double a = Double.parseDouble(n1.getText().toString());
double b = Double.parseDouble(n2.getText().toString());
ans= a / b;
                }
            }
        });
e.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
                String ans1 = String.valueOf(ans);
an.setText(ans1);
ans= 0;
            }
        });





    }

}
