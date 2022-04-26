package com.jsstech.recyclerviewpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),PoemAdapter.PoemInteface {
    var poemList:MutableList<PoemModel> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        poemList.add(PoemModel(R.drawable.poemimage,"RecyclerView.","RecyclerView is the ViewGroupThe  that contains the views corresponding to your data. It's a view itself, so you add RecyclerView into your layout the way you would add any other UI element. Each individual element in the list is defined by a view holder object" +
                " RecyclerView class extends the ViewGroup class and implements ScrollingView interface. " +
                "        that contains the views corresponding to your data. It's a view itself, so you add RecyclerView into your layout the way you would add any other UI element. Each individual element in the list is defined by a view holder object" +
                " It is introduced in Marshmallow." +
                "        It is an advanced version of the ..." +
                "    RecyclerView is the ViewGroupThe  that contains the views corresponding to your data. It's a view itself, so you add RecyclerView into your layout the way you would add any other UI element. Each individual element in the list is defined by a view holder object" +
                " RecyclerView class extends the ViewGroup class and implements ScrollingView interface. that contains the views corresponding to your data. It's a view itself, so you add RecyclerView into your layout the way you would add any other UI element. Each individual element in the list is defined by a view holder object" +
                " It is introduced in Marshmallow. It is an advanced version of the ..." +
                "        RecyclerView is the ViewGroupThe  that contains the views corresponding to your data. It's a view itself, so you add RecyclerView into your layout the way you would add any other UI element. Each individual element in the list is defined by a view holder object" +
                " RecyclerView class extends the ViewGroup class and implements ScrollingView interface. that contains the views corresponding to your data. It's a view itself, so you add RecyclerView into your layout the way you would add any other UI element. Each individual element in the list is defined by a view holder object" +
                " It is introduced in Marshmallow. It is an advanced version of the ..." +
                "" +
                "        Thans and Regards" +
                "         Ms. SaNj.. " +
                "        (E) - pandeysanj716@gmail.com" +
                "        (W) - www.google.com" +
                "        (M) - 7709655847"+"It is introduced in Marshmallow. It is an advanced version of the ...\""
        ))
        poemList.add(PoemModel(R.drawable.roomdb,"Room database","\"How to add Room Database in android studio\" +\n" +
                "                \"Insert,Update,Delete record\" +\n" +
                "                \"How to pass query in Database\" +\n" +
                "                \"What is a Room?\" +\n" +
                "                \"The Room strong library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.\\n\" +\n" +
                "                \"\" +\n" +
                "                \"Normally Room databases are fast created and have good performance like reading, updating and deleting records. Room Database makes everything easy and fast\\n\" +\n" +
                "                \"\" +\n" +
                "                \"Room Database more detail open this link: https://developer.android.com/training/data-storage/room/\\n\" +\n" +
                "                \"Components of Room Here room have main 3 components\" +\n" +
                "                \"Entity:\" +\n" +
                "                \"Instead of creating the SQLite table, we will create the Entity. An entity is nothing but a model class annotated with @Entity. The variables of this class are our columns, and the class is our table.\\n\" +\n" +
                "                \"Database:\" +\n" +
                "                \"It is an abstract class where we define all our entities.\" +\n" +
                "                \"DAO:\" +\n" +
                "                \"Stands for Data Access Objects. It is an interface that defines all the operations that we need to perform in our database.\\n\" +\n" +
                "                \"Demo App Create\" +\n" +
                "                \"First, we create a new project in android studio.\\n\" +\n" +
                "                \"Name of my project \\\"Room DataBase\\\"\" +\n" +
                "                \"Adding Dependencies\" +\n" +
                "                \"Add needed dependencies for the room database.\" +\n" +
                "                \"Android studio in this file add dependencies \\\"build.gradle\\\".\" +\n" +
                "                \"See the below image and add the latest version room database replace here add original version\\n\" +\n" +
                "                \"First, we will create DAO class:\\n\" +\n" +
                "                \"This DAO class-main work intermediary between the user and database. All performed operations are defined here.\\n\" +\n" +
                "                \"Below create StudentDao class\" +\n" +
                "                \"@Dao\" +\n" +
                "                \"public interface StudentDao {\" +\n" +
                "                \"\\n\" +\n" +
                "                \"@Query(\\\"SELECT * FROM Student\\\")\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"@Insert\\n\" +\n" +
                "                \"void insert(Student student);\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"@Update\\n\" +\n" +
                "                \"void updateTask(Student student);\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"@Delete\\n\" +\n" +
                "                \"void deleteTask(Student student);\"))\n"))
        poemList.add(PoemModel(R.drawable.sqlimg,"SQL Introduction","What is SQL?\n" +
                "SQL stands for Structured Query Language\n" +
                "SQL lets you access and manipulate databases\n" +
                "SQL became a standard of the American National Standards Institute (ANSI) in 1986, and of the International Organization for Standardization (ISO) in 1987\n" +
                "What Can SQL do?\n" +
                "SQL can execute queries against a database\n" +
                "SQL can retrieve data from a database\n" +
                "SQL can insert records in a database\n" +
                "SQL can update records in a database\n" +
                "SQL can delete records from a database\n" +
                "SQL can create new databases\n" +
                "SQL can create new tables in a database\n" +
                "SQL can create stored procedures in a database\n" +
                "SQL can create views in a database\n" +
                "SQL can set permissions on tables, procedures, and views\n" +
                "SQL is a Standard - BUT....\n" +
                "Although SQL is an ANSI/ISO standard, there are different versions of the SQL language.\n" +
                "\n" +
                "However, to be compliant with the ANSI standard, they all support at least the major commands (such as SELECT, UPDATE, DELETE, INSERT, WHERE) in a similar manner.\n" +
                "\n" +
                "Note: Most of the SQL database programs also have their own proprietary extensions in addition to the SQL standard!\n" +
                "\n" +
                "Using SQL in Your Web Site\n" +
                "To build a web site that shows data from a database, you will need:\n" +
                "\n" +
                "An RDBMS database program (i.e. MS Access, SQL Server, MySQL)\n" +
                "To use a server-side scripting language, like PHP or ASP\n" +
                "To use SQL to get the data you want\n" +
                "To use HTML / CSS to style the page\n" +
                "ADVERTISEMENT\n" +
                "\n" +
                "RDBMS\n" +
                "RDBMS stands for Relational Database Management System.\n" +
                "\n" +
                "RDBMS is the basis for SQL, and for all modern database systems such as MS SQL Server, IBM DB2, Oracle, MySQL, and Microsoft Access.\n" +
                "\n" +
                "The data in RDBMS is stored in database objects called tables. A table is a collection of related data entries and it consists of columns and rows.\n" +
                "\n" +
                "Look at the \"Customers\" table:\n" +
                "\n" +
                "Example\n" +
                "SELECT * FROM Customers;"))
        poemList.add(PoemModel(R.drawable.roomdb,"Room Database","How to use the Room database\n" +
                "How to add Room Database in android studio" +
                "Insert,Update,Delete record" +
                "How to pass query in Database" +
                "What is a Room?" +
                "The Room strong library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.\n" +
                "" +
                "Normally Room databases are fast created and have good performance like reading, updating and deleting records. Room Database makes everything easy and fast\n" +
                "" +
                "Room Database more detail open this link: https://developer.android.com/training/data-storage/room/\n" +
                "Components of Room Here room have main 3 components" +
                "Entity:" +
                "Instead of creating the SQLite table, we will create the Entity. An entity is nothing but a model class annotated with @Entity. The variables of this class are our columns, and the class is our table.\n" +
                "Database:" +
                "It is an abstract class where we define all our entities." +
                "DAO:" +
                "Stands for Data Access Objects. It is an interface that defines all the operations that we need to perform in our database.\n" +
                "Demo App Create" +
                "First, we create a new project in android studio.\n" +
                "Name of my project \"Room DataBase\"" +
                "Adding Dependencies" +
                "Add needed dependencies for the room database." +
                "Android studio in this file add dependencies \"build.gradle\"." +
                "See the below image and add the latest version room database replace here add original version\n" +
                "First, we will create DAO class:\n" +
                "This DAO class-main work intermediary between the user and database. All performed operations are defined here.\n" +
                "Below create StudentDao class" +
                "@Dao" +
                "public interface StudentDao {" +
                "\n" +
                "@Query(\"SELECT * FROM Student\")\n" +
                "\n" +
                "\n" +
                "@Insert\n" +
                "void insert(Student student);\n" +
                "\n" +
                "@Update\n" +
                "void updateTask(Student student);\n" +
                "\n" +
                "@Delete\n" +
                "void deleteTask(Student student);"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"Sqlite Database","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"oracle","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"comics","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"comics","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"comics","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"comics","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"comics","R.string.desc_name"))
        poemList.add(PoemModel(R.drawable.ic_launcher_background,"comics","R.string.desc_name"))

        var poemAdapter=PoemAdapter(this,poemList)
        rvPoem.layoutManager=LinearLayoutManager(this)
        rvPoem.adapter=poemAdapter

        poemAdapter.setOnClickListener(this)

       // rvPoem.adapter=PoemAdapter(this,poemList)
    }

    override fun onClickPoem(position: Int) {
        Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        var intent=Intent(this,DetailActivity::class.java)
        intent.putExtra("IMAGE",poemList[position].poemIamge)
        intent.putExtra("TITLE",poemList[position].poemName)
        intent.putExtra("DESC",poemList[position].poemDesc)
        startActivity(intent)

    }

    class DetailActivity(): AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_detail)
            initView()
        }

        private fun initView() {
           var intent=intent
            val extra = intent.getIntExtra("IMAGE",0)
            val extraTitle=intent.getStringExtra("TITLE")
            val extraDesc=intent.getStringExtra("DESC")


            poemDetail_img.setImageResource(extra)
            poemDetail_title.text=extraTitle
            poemDetail_Desc.text=extraDesc
        }

    }
}

