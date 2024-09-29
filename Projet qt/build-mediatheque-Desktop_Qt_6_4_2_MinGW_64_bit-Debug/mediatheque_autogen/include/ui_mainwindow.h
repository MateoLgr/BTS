/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 6.4.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QDateEdit>
#include <QtWidgets/QFrame>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QListView>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralwidget;
    QFrame *frame_search;
    QLabel *label_2;
    QLabel *label_6;
    QLabel *label_7;
    QLineEdit *lineEdit_searchTitre;
    QLabel *label_8;
    QLineEdit *lineEdit_searchAuteur;
    QWidget *verticalLayoutWidget_3;
    QVBoxLayout *verticalLayout_3;
    QPushButton *pushButton_search;
    QDateEdit *dateEdit_search;
    QFrame *frame_livre;
    QLabel *label_9;
    QLabel *label_10;
    QLineEdit *lineEdit_addLivreTitre;
    QLabel *label_11;
    QLineEdit *lineEdit_addLivreAuteur;
    QLabel *label_12;
    QDateEdit *dateEdit_addLivre;
    QLabel *label_13;
    QSpinBox *spinBox_addLivre;
    QWidget *verticalLayoutWidget_4;
    QVBoxLayout *verticalLayout_4;
    QPushButton *pushButton_addLivre;
    QLabel *label_19;
    QFrame *frame_dvd;
    QLabel *label_21;
    QLabel *label_22;
    QLineEdit *lineEdit_addDvdTitre;
    QLabel *label_23;
    QLineEdit *lineEdit_addDvdAuteur;
    QLabel *label_24;
    QDateEdit *dateEdit_addDvd;
    QLabel *label_25;
    QSpinBox *spinBox_addDvd;
    QWidget *verticalLayoutWidget_6;
    QVBoxLayout *verticalLayout_6;
    QPushButton *pushButton_addDvd;
    QLabel *label_26;
    QFrame *frame_button;
    QWidget *verticalLayoutWidget_2;
    QVBoxLayout *verticalLayout_2;
    QPushButton *pushButton_forAddLivre;
    QPushButton *pushButton_forAddDvd;
    QPushButton *pushButton_forAddCd;
    QPushButton *pushButton_forSearch;
    QPushButton *pushButton_forTake;
    QPushButton *pushButton_forReturn;
    QPushButton *pushButton_retour;
    QPushButton *pushButton;
    QFrame *frame_retour;
    QLabel *label_27;
    QLabel *label_28;
    QLabel *label_29;
    QLabel *label_30;
    QWidget *verticalLayoutWidget_7;
    QVBoxLayout *verticalLayout_7;
    QPushButton *pushButton_return;
    QLineEdit *lineEdit_returnNom;
    QLineEdit *lineEdit_returnPrenom;
    QLineEdit *lineEdit_returnTitre;
    QFrame *frame_take;
    QLabel *label_3;
    QLabel *label_4;
    QLabel *label;
    QLabel *label_5;
    QWidget *verticalLayoutWidget;
    QVBoxLayout *verticalLayout;
    QPushButton *pushButton_take;
    QLineEdit *lineEdit_takeNom;
    QLineEdit *lineEdit_takePrenom;
    QLineEdit *lineEdit_takeTitre;
    QLabel *label_31;
    QFrame *frame_cd;
    QLabel *label_14;
    QLabel *label_15;
    QLineEdit *lineEdit_addCdTitre;
    QLabel *label_16;
    QLineEdit *lineEdit_addCdAuteur;
    QLabel *label_17;
    QDateEdit *dateEdit_addCd;
    QLabel *label_18;
    QSpinBox *spinBox_addCd;
    QWidget *verticalLayoutWidget_5;
    QVBoxLayout *verticalLayout_5;
    QPushButton *pushButton_addCd;
    QLabel *label_20;
    QPushButton *pushButton_OnOffListe;
    QFrame *frame_liste;
    QListView *listView;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName("MainWindow");
        MainWindow->resize(1301, 600);
        MainWindow->setStyleSheet(QString::fromUtf8("background-color: rgb(170, 190, 255);\n"
"color: rgb(0, 0, 0);"));
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName("centralwidget");
        frame_search = new QFrame(centralwidget);
        frame_search->setObjectName("frame_search");
        frame_search->setGeometry(QRect(410, -30, 381, 231));
        frame_search->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_search->setFrameShape(QFrame::StyledPanel);
        frame_search->setFrameShadow(QFrame::Raised);
        label_2 = new QLabel(frame_search);
        label_2->setObjectName("label_2");
        label_2->setGeometry(QRect(150, 10, 81, 20));
        label_6 = new QLabel(frame_search);
        label_6->setObjectName("label_6");
        label_6->setGeometry(QRect(10, 30, 63, 20));
        label_7 = new QLabel(frame_search);
        label_7->setObjectName("label_7");
        label_7->setGeometry(QRect(10, 90, 63, 20));
        lineEdit_searchTitre = new QLineEdit(frame_search);
        lineEdit_searchTitre->setObjectName("lineEdit_searchTitre");
        lineEdit_searchTitre->setGeometry(QRect(10, 50, 171, 28));
        label_8 = new QLabel(frame_search);
        label_8->setObjectName("label_8");
        label_8->setGeometry(QRect(220, 60, 91, 20));
        lineEdit_searchAuteur = new QLineEdit(frame_search);
        lineEdit_searchAuteur->setObjectName("lineEdit_searchAuteur");
        lineEdit_searchAuteur->setGeometry(QRect(220, 80, 113, 28));
        verticalLayoutWidget_3 = new QWidget(frame_search);
        verticalLayoutWidget_3->setObjectName("verticalLayoutWidget_3");
        verticalLayoutWidget_3->setGeometry(QRect(0, 170, 381, 48));
        verticalLayout_3 = new QVBoxLayout(verticalLayoutWidget_3);
        verticalLayout_3->setObjectName("verticalLayout_3");
        verticalLayout_3->setContentsMargins(0, 0, 0, 0);
        pushButton_search = new QPushButton(verticalLayoutWidget_3);
        pushButton_search->setObjectName("pushButton_search");

        verticalLayout_3->addWidget(pushButton_search);

        dateEdit_search = new QDateEdit(frame_search);
        dateEdit_search->setObjectName("dateEdit_search");
        dateEdit_search->setGeometry(QRect(10, 110, 110, 29));
        frame_livre = new QFrame(centralwidget);
        frame_livre->setObjectName("frame_livre");
        frame_livre->setGeometry(QRect(10, 0, 421, 251));
        frame_livre->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_livre->setFrameShape(QFrame::StyledPanel);
        frame_livre->setFrameShadow(QFrame::Raised);
        label_9 = new QLabel(frame_livre);
        label_9->setObjectName("label_9");
        label_9->setGeometry(QRect(150, 10, 111, 20));
        label_10 = new QLabel(frame_livre);
        label_10->setObjectName("label_10");
        label_10->setGeometry(QRect(10, 40, 63, 20));
        lineEdit_addLivreTitre = new QLineEdit(frame_livre);
        lineEdit_addLivreTitre->setObjectName("lineEdit_addLivreTitre");
        lineEdit_addLivreTitre->setGeometry(QRect(10, 60, 113, 28));
        label_11 = new QLabel(frame_livre);
        label_11->setObjectName("label_11");
        label_11->setGeometry(QRect(10, 100, 91, 20));
        lineEdit_addLivreAuteur = new QLineEdit(frame_livre);
        lineEdit_addLivreAuteur->setObjectName("lineEdit_addLivreAuteur");
        lineEdit_addLivreAuteur->setGeometry(QRect(10, 120, 113, 28));
        label_12 = new QLabel(frame_livre);
        label_12->setObjectName("label_12");
        label_12->setGeometry(QRect(260, 50, 63, 20));
        dateEdit_addLivre = new QDateEdit(frame_livre);
        dateEdit_addLivre->setObjectName("dateEdit_addLivre");
        dateEdit_addLivre->setGeometry(QRect(260, 70, 110, 29));
        label_13 = new QLabel(frame_livre);
        label_13->setObjectName("label_13");
        label_13->setGeometry(QRect(260, 110, 131, 20));
        spinBox_addLivre = new QSpinBox(frame_livre);
        spinBox_addLivre->setObjectName("spinBox_addLivre");
        spinBox_addLivre->setGeometry(QRect(260, 140, 48, 29));
        verticalLayoutWidget_4 = new QWidget(frame_livre);
        verticalLayoutWidget_4->setObjectName("verticalLayoutWidget_4");
        verticalLayoutWidget_4->setGeometry(QRect(0, 210, 421, 31));
        verticalLayout_4 = new QVBoxLayout(verticalLayoutWidget_4);
        verticalLayout_4->setObjectName("verticalLayout_4");
        verticalLayout_4->setContentsMargins(0, 0, 0, 0);
        pushButton_addLivre = new QPushButton(verticalLayoutWidget_4);
        pushButton_addLivre->setObjectName("pushButton_addLivre");

        verticalLayout_4->addWidget(pushButton_addLivre);

        label_19 = new QLabel(frame_livre);
        label_19->setObjectName("label_19");
        label_19->setGeometry(QRect(310, 140, 63, 20));
        frame_dvd = new QFrame(centralwidget);
        frame_dvd->setObjectName("frame_dvd");
        frame_dvd->setGeometry(QRect(10, 0, 421, 251));
        frame_dvd->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_dvd->setFrameShape(QFrame::StyledPanel);
        frame_dvd->setFrameShadow(QFrame::Raised);
        label_21 = new QLabel(frame_dvd);
        label_21->setObjectName("label_21");
        label_21->setGeometry(QRect(150, 10, 111, 20));
        label_22 = new QLabel(frame_dvd);
        label_22->setObjectName("label_22");
        label_22->setGeometry(QRect(10, 40, 63, 20));
        lineEdit_addDvdTitre = new QLineEdit(frame_dvd);
        lineEdit_addDvdTitre->setObjectName("lineEdit_addDvdTitre");
        lineEdit_addDvdTitre->setGeometry(QRect(10, 60, 113, 28));
        label_23 = new QLabel(frame_dvd);
        label_23->setObjectName("label_23");
        label_23->setGeometry(QRect(10, 100, 91, 20));
        lineEdit_addDvdAuteur = new QLineEdit(frame_dvd);
        lineEdit_addDvdAuteur->setObjectName("lineEdit_addDvdAuteur");
        lineEdit_addDvdAuteur->setGeometry(QRect(10, 120, 113, 28));
        label_24 = new QLabel(frame_dvd);
        label_24->setObjectName("label_24");
        label_24->setGeometry(QRect(260, 50, 63, 20));
        dateEdit_addDvd = new QDateEdit(frame_dvd);
        dateEdit_addDvd->setObjectName("dateEdit_addDvd");
        dateEdit_addDvd->setGeometry(QRect(260, 70, 110, 29));
        label_25 = new QLabel(frame_dvd);
        label_25->setObjectName("label_25");
        label_25->setGeometry(QRect(260, 110, 131, 20));
        spinBox_addDvd = new QSpinBox(frame_dvd);
        spinBox_addDvd->setObjectName("spinBox_addDvd");
        spinBox_addDvd->setGeometry(QRect(260, 140, 48, 29));
        verticalLayoutWidget_6 = new QWidget(frame_dvd);
        verticalLayoutWidget_6->setObjectName("verticalLayoutWidget_6");
        verticalLayoutWidget_6->setGeometry(QRect(0, 210, 421, 31));
        verticalLayout_6 = new QVBoxLayout(verticalLayoutWidget_6);
        verticalLayout_6->setObjectName("verticalLayout_6");
        verticalLayout_6->setContentsMargins(0, 0, 0, 0);
        pushButton_addDvd = new QPushButton(verticalLayoutWidget_6);
        pushButton_addDvd->setObjectName("pushButton_addDvd");

        verticalLayout_6->addWidget(pushButton_addDvd);

        label_26 = new QLabel(frame_dvd);
        label_26->setObjectName("label_26");
        label_26->setGeometry(QRect(310, 150, 63, 20));
        frame_button = new QFrame(centralwidget);
        frame_button->setObjectName("frame_button");
        frame_button->setGeometry(QRect(430, 210, 321, 241));
        frame_button->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_button->setFrameShape(QFrame::StyledPanel);
        frame_button->setFrameShadow(QFrame::Raised);
        verticalLayoutWidget_2 = new QWidget(frame_button);
        verticalLayoutWidget_2->setObjectName("verticalLayoutWidget_2");
        verticalLayoutWidget_2->setGeometry(QRect(10, 10, 301, 221));
        verticalLayout_2 = new QVBoxLayout(verticalLayoutWidget_2);
        verticalLayout_2->setObjectName("verticalLayout_2");
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        pushButton_forAddLivre = new QPushButton(verticalLayoutWidget_2);
        pushButton_forAddLivre->setObjectName("pushButton_forAddLivre");

        verticalLayout_2->addWidget(pushButton_forAddLivre);

        pushButton_forAddDvd = new QPushButton(verticalLayoutWidget_2);
        pushButton_forAddDvd->setObjectName("pushButton_forAddDvd");

        verticalLayout_2->addWidget(pushButton_forAddDvd);

        pushButton_forAddCd = new QPushButton(verticalLayoutWidget_2);
        pushButton_forAddCd->setObjectName("pushButton_forAddCd");

        verticalLayout_2->addWidget(pushButton_forAddCd);

        pushButton_forSearch = new QPushButton(verticalLayoutWidget_2);
        pushButton_forSearch->setObjectName("pushButton_forSearch");

        verticalLayout_2->addWidget(pushButton_forSearch);

        pushButton_forTake = new QPushButton(verticalLayoutWidget_2);
        pushButton_forTake->setObjectName("pushButton_forTake");

        verticalLayout_2->addWidget(pushButton_forTake);

        pushButton_forReturn = new QPushButton(verticalLayoutWidget_2);
        pushButton_forReturn->setObjectName("pushButton_forReturn");

        verticalLayout_2->addWidget(pushButton_forReturn);

        pushButton_retour = new QPushButton(centralwidget);
        pushButton_retour->setObjectName("pushButton_retour");
        pushButton_retour->setGeometry(QRect(110, 510, 83, 29));
        pushButton = new QPushButton(centralwidget);
        pushButton->setObjectName("pushButton");
        pushButton->setGeometry(QRect(20, 510, 83, 29));
        frame_retour = new QFrame(centralwidget);
        frame_retour->setObjectName("frame_retour");
        frame_retour->setGeometry(QRect(10, 260, 411, 231));
        frame_retour->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_retour->setFrameShape(QFrame::StyledPanel);
        frame_retour->setFrameShadow(QFrame::Raised);
        label_27 = new QLabel(frame_retour);
        label_27->setObjectName("label_27");
        label_27->setGeometry(QRect(10, 20, 63, 20));
        label_28 = new QLabel(frame_retour);
        label_28->setObjectName("label_28");
        label_28->setGeometry(QRect(10, 70, 63, 20));
        label_29 = new QLabel(frame_retour);
        label_29->setObjectName("label_29");
        label_29->setGeometry(QRect(180, 10, 63, 20));
        label_30 = new QLabel(frame_retour);
        label_30->setObjectName("label_30");
        label_30->setGeometry(QRect(210, 40, 181, 20));
        verticalLayoutWidget_7 = new QWidget(frame_retour);
        verticalLayoutWidget_7->setObjectName("verticalLayoutWidget_7");
        verticalLayoutWidget_7->setGeometry(QRect(10, 170, 401, 41));
        verticalLayout_7 = new QVBoxLayout(verticalLayoutWidget_7);
        verticalLayout_7->setObjectName("verticalLayout_7");
        verticalLayout_7->setContentsMargins(0, 0, 0, 0);
        pushButton_return = new QPushButton(verticalLayoutWidget_7);
        pushButton_return->setObjectName("pushButton_return");

        verticalLayout_7->addWidget(pushButton_return);

        lineEdit_returnNom = new QLineEdit(frame_retour);
        lineEdit_returnNom->setObjectName("lineEdit_returnNom");
        lineEdit_returnNom->setGeometry(QRect(10, 40, 113, 28));
        lineEdit_returnPrenom = new QLineEdit(frame_retour);
        lineEdit_returnPrenom->setObjectName("lineEdit_returnPrenom");
        lineEdit_returnPrenom->setGeometry(QRect(10, 90, 131, 28));
        lineEdit_returnTitre = new QLineEdit(frame_retour);
        lineEdit_returnTitre->setObjectName("lineEdit_returnTitre");
        lineEdit_returnTitre->setGeometry(QRect(210, 60, 181, 28));
        frame_take = new QFrame(centralwidget);
        frame_take->setObjectName("frame_take");
        frame_take->setGeometry(QRect(90, 310, 461, 231));
        frame_take->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_take->setFrameShape(QFrame::StyledPanel);
        frame_take->setFrameShadow(QFrame::Raised);
        label_3 = new QLabel(frame_take);
        label_3->setObjectName("label_3");
        label_3->setGeometry(QRect(10, 20, 63, 20));
        label_4 = new QLabel(frame_take);
        label_4->setObjectName("label_4");
        label_4->setGeometry(QRect(10, 70, 63, 20));
        label = new QLabel(frame_take);
        label->setObjectName("label");
        label->setGeometry(QRect(160, 10, 63, 20));
        label_5 = new QLabel(frame_take);
        label_5->setObjectName("label_5");
        label_5->setGeometry(QRect(210, 50, 181, 20));
        verticalLayoutWidget = new QWidget(frame_take);
        verticalLayoutWidget->setObjectName("verticalLayoutWidget");
        verticalLayoutWidget->setGeometry(QRect(0, 170, 401, 41));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout->setObjectName("verticalLayout");
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        pushButton_take = new QPushButton(verticalLayoutWidget);
        pushButton_take->setObjectName("pushButton_take");

        verticalLayout->addWidget(pushButton_take);

        lineEdit_takeNom = new QLineEdit(frame_take);
        lineEdit_takeNom->setObjectName("lineEdit_takeNom");
        lineEdit_takeNom->setGeometry(QRect(10, 40, 113, 28));
        lineEdit_takePrenom = new QLineEdit(frame_take);
        lineEdit_takePrenom->setObjectName("lineEdit_takePrenom");
        lineEdit_takePrenom->setGeometry(QRect(10, 90, 131, 28));
        lineEdit_takeTitre = new QLineEdit(frame_take);
        lineEdit_takeTitre->setObjectName("lineEdit_takeTitre");
        lineEdit_takeTitre->setGeometry(QRect(210, 70, 181, 28));
        label_31 = new QLabel(centralwidget);
        label_31->setObjectName("label_31");
        label_31->setGeometry(QRect(980, 50, 121, 20));
        frame_cd = new QFrame(centralwidget);
        frame_cd->setObjectName("frame_cd");
        frame_cd->setGeometry(QRect(10, 0, 421, 251));
        frame_cd->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        frame_cd->setFrameShape(QFrame::StyledPanel);
        frame_cd->setFrameShadow(QFrame::Raised);
        label_14 = new QLabel(frame_cd);
        label_14->setObjectName("label_14");
        label_14->setGeometry(QRect(150, 10, 111, 20));
        label_15 = new QLabel(frame_cd);
        label_15->setObjectName("label_15");
        label_15->setGeometry(QRect(10, 40, 63, 20));
        lineEdit_addCdTitre = new QLineEdit(frame_cd);
        lineEdit_addCdTitre->setObjectName("lineEdit_addCdTitre");
        lineEdit_addCdTitre->setGeometry(QRect(10, 60, 113, 28));
        label_16 = new QLabel(frame_cd);
        label_16->setObjectName("label_16");
        label_16->setGeometry(QRect(10, 100, 91, 20));
        lineEdit_addCdAuteur = new QLineEdit(frame_cd);
        lineEdit_addCdAuteur->setObjectName("lineEdit_addCdAuteur");
        lineEdit_addCdAuteur->setGeometry(QRect(10, 120, 113, 28));
        label_17 = new QLabel(frame_cd);
        label_17->setObjectName("label_17");
        label_17->setGeometry(QRect(260, 50, 63, 20));
        dateEdit_addCd = new QDateEdit(frame_cd);
        dateEdit_addCd->setObjectName("dateEdit_addCd");
        dateEdit_addCd->setGeometry(QRect(260, 70, 110, 29));
        label_18 = new QLabel(frame_cd);
        label_18->setObjectName("label_18");
        label_18->setGeometry(QRect(260, 110, 131, 20));
        spinBox_addCd = new QSpinBox(frame_cd);
        spinBox_addCd->setObjectName("spinBox_addCd");
        spinBox_addCd->setGeometry(QRect(260, 140, 48, 29));
        verticalLayoutWidget_5 = new QWidget(frame_cd);
        verticalLayoutWidget_5->setObjectName("verticalLayoutWidget_5");
        verticalLayoutWidget_5->setGeometry(QRect(0, 210, 421, 31));
        verticalLayout_5 = new QVBoxLayout(verticalLayoutWidget_5);
        verticalLayout_5->setObjectName("verticalLayout_5");
        verticalLayout_5->setContentsMargins(0, 0, 0, 0);
        pushButton_addCd = new QPushButton(verticalLayoutWidget_5);
        pushButton_addCd->setObjectName("pushButton_addCd");

        verticalLayout_5->addWidget(pushButton_addCd);

        label_20 = new QLabel(frame_cd);
        label_20->setObjectName("label_20");
        label_20->setGeometry(QRect(310, 150, 63, 20));
        pushButton_OnOffListe = new QPushButton(centralwidget);
        pushButton_OnOffListe->setObjectName("pushButton_OnOffListe");
        pushButton_OnOffListe->setGeometry(QRect(920, 10, 241, 29));
        frame_liste = new QFrame(centralwidget);
        frame_liste->setObjectName("frame_liste");
        frame_liste->setGeometry(QRect(760, 80, 531, 461));
        frame_liste->setStyleSheet(QString::fromUtf8("\n"
"background-color: rgb(199, 214, 255);"));
        frame_liste->setFrameShape(QFrame::StyledPanel);
        frame_liste->setFrameShadow(QFrame::Raised);
        listView = new QListView(frame_liste);
        listView->setObjectName("listView");
        listView->setGeometry(QRect(10, 10, 511, 441));
        listView->setStyleSheet(QString::fromUtf8("background-color: rgb(199, 214, 255);"));
        MainWindow->setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar->setObjectName("menubar");
        menubar->setGeometry(QRect(0, 0, 1301, 25));
        MainWindow->setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar->setObjectName("statusbar");
        MainWindow->setStatusBar(statusbar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QCoreApplication::translate("MainWindow", "MainWindow", nullptr));
        label_2->setText(QCoreApplication::translate("MainWindow", "Recherche :", nullptr));
        label_6->setText(QCoreApplication::translate("MainWindow", "Par titre :", nullptr));
        label_7->setText(QCoreApplication::translate("MainWindow", "Par date :", nullptr));
        lineEdit_searchTitre->setText(QString());
        label_8->setText(QCoreApplication::translate("MainWindow", " Par auteur :", nullptr));
        pushButton_search->setText(QCoreApplication::translate("MainWindow", "Rechercher", nullptr));
        label_9->setText(QCoreApplication::translate("MainWindow", "Ajout d'un livre :", nullptr));
        label_10->setText(QCoreApplication::translate("MainWindow", "Titre :", nullptr));
        label_11->setText(QCoreApplication::translate("MainWindow", "Auteur :", nullptr));
        label_12->setText(QCoreApplication::translate("MainWindow", "Date :", nullptr));
        label_13->setText(QCoreApplication::translate("MainWindow", "Nombre de pages :", nullptr));
        pushButton_addLivre->setText(QCoreApplication::translate("MainWindow", "Ajouter", nullptr));
        label_19->setText(QCoreApplication::translate("MainWindow", "pages", nullptr));
        label_21->setText(QCoreApplication::translate("MainWindow", "Ajout d'un DVD :", nullptr));
        label_22->setText(QCoreApplication::translate("MainWindow", "Titre :", nullptr));
        label_23->setText(QCoreApplication::translate("MainWindow", "Auteur :", nullptr));
        label_24->setText(QCoreApplication::translate("MainWindow", "Date :", nullptr));
        label_25->setText(QCoreApplication::translate("MainWindow", "Taille :", nullptr));
        pushButton_addDvd->setText(QCoreApplication::translate("MainWindow", "Ajouter", nullptr));
        label_26->setText(QCoreApplication::translate("MainWindow", "Go", nullptr));
        pushButton_forAddLivre->setText(QCoreApplication::translate("MainWindow", "Je veux ajout\303\251 un livre", nullptr));
        pushButton_forAddDvd->setText(QCoreApplication::translate("MainWindow", "Je veux ajout\303\251 un DVD", nullptr));
        pushButton_forAddCd->setText(QCoreApplication::translate("MainWindow", "Je veux ajout\303\251 un CD", nullptr));
        pushButton_forSearch->setText(QCoreApplication::translate("MainWindow", "Je veux recherch\303\251 un m\303\251dia", nullptr));
        pushButton_forTake->setText(QCoreApplication::translate("MainWindow", "Je veux emprunt\303\251 un m\303\251dia", nullptr));
        pushButton_forReturn->setText(QCoreApplication::translate("MainWindow", "Je veux rendre un m\303\251dia", nullptr));
        pushButton_retour->setText(QCoreApplication::translate("MainWindow", "Retour", nullptr));
        pushButton->setText(QCoreApplication::translate("MainWindow", "Quitter", nullptr));
        label_27->setText(QCoreApplication::translate("MainWindow", "Nom :", nullptr));
        label_28->setText(QCoreApplication::translate("MainWindow", "Pr\303\251nom :", nullptr));
        label_29->setText(QCoreApplication::translate("MainWindow", "Retour :", nullptr));
        label_30->setText(QCoreApplication::translate("MainWindow", "Titre du media rendu :", nullptr));
        pushButton_return->setText(QCoreApplication::translate("MainWindow", "Le rendre", nullptr));
        lineEdit_returnTitre->setText(QString());
        label_3->setText(QCoreApplication::translate("MainWindow", "Nom :", nullptr));
        label_4->setText(QCoreApplication::translate("MainWindow", "Pr\303\251nom :", nullptr));
        label->setText(QCoreApplication::translate("MainWindow", "Emprunt :", nullptr));
        label_5->setText(QCoreApplication::translate("MainWindow", "Titre du media emprunt\303\251 :", nullptr));
        pushButton_take->setText(QCoreApplication::translate("MainWindow", "L'emprunter", nullptr));
        lineEdit_takeTitre->setText(QString());
        label_31->setText(QCoreApplication::translate("MainWindow", "Liste des m\303\251dias :", nullptr));
        label_14->setText(QCoreApplication::translate("MainWindow", "Ajout d'un CD :", nullptr));
        label_15->setText(QCoreApplication::translate("MainWindow", "Titre :", nullptr));
        label_16->setText(QCoreApplication::translate("MainWindow", "Auteur :", nullptr));
        label_17->setText(QCoreApplication::translate("MainWindow", "Date :", nullptr));
        label_18->setText(QCoreApplication::translate("MainWindow", "Taille :", nullptr));
        pushButton_addCd->setText(QCoreApplication::translate("MainWindow", "L'ajouter", nullptr));
        label_20->setText(QCoreApplication::translate("MainWindow", "Go", nullptr));
        pushButton_OnOffListe->setText(QCoreApplication::translate("MainWindow", "On / Off Liste", nullptr));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
