#include "mainwindow.h"
#include "./ui_mainwindow.h"
#include <QStringList>
#include <QStringListModel>
#include <QAbstractItemView>
#include <QAbstractListModel>
#include <QStandardItemModel>
#include <QListView>
#include <QAbstractItemModel>



MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    ui->frame_search->hide(); //Cache la fenêtre recherche
    ui->frame_take->hide(); //Cache la fenêtre emprunter
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->show(); //Affiche la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
    affichage="";
    ui->frame_liste->hide(); //Cache la liste
}

MainWindow::~MainWindow()
{
    delete ui;
}



void MainWindow::on_pushButton_forSearch_clicked()
{
    ui->frame_search->show();  //Affiche la fenêtre recherche
    ui->frame_take->hide(); //Cache la fenêtre emprunter
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->hide(); //Cache la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
}





void MainWindow::on_pushButton_forTake_clicked()
{
    ui->frame_take->show(); //Affiche la fenêtre emprunt
    ui->frame_search->hide(); //Cache la fenêtre recherche
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->hide(); //Cache la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
}


void MainWindow::on_pushButton_forAddLivre_clicked()
{
    ui->frame_take->hide(); //Cache la fenêtre emprunt
    ui->frame_search->hide(); //Cache la fenêtre recherche
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->show(); //Affiche la fenêtre ajouter livre
    ui->frame_button->hide(); //Cache la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
}


void MainWindow::on_pushButton_forAddDvd_clicked()
{
    ui->frame_take->hide(); //Cache la fenêtre emprunt
    ui->frame_search->hide(); //Cache la fenêtre recherche
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->show(); //Affiche la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->hide(); //Cache la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
}


void MainWindow::on_pushButton_forAddCd_clicked()//
{
    ui->frame_take->hide(); //Cache la fenêtre emprunt
    ui->frame_search->hide(); //Cache la fenêtre recherche
    ui->frame_cd->show(); //Affiche la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->hide(); //Cache la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
}




void MainWindow::on_pushButton_retour_clicked()
{
    ui->frame_search->hide(); //Cache la fenêtre emprunt
    ui->frame_take->hide(); //Cache la fenêtre recherche
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->show(); //Affiche la fenêtre du menu
    ui->frame_retour->hide(); //Cache la fenêtre retour d'emprunt
}


void MainWindow::on_pushButton_clicked()
{
    delete ui; //quite l'IHM
}


void MainWindow::on_pushButton_forReturn_clicked()
{
    ui->frame_search->hide(); //Cache la fenêtre emprunt
    ui->frame_take->hide(); //Cache la fenêtre recherche
    ui->frame_cd->hide(); //Cache la fenêtre ajouter cd
    ui->frame_dvd->hide(); //Cache la fenêtre ajouter dvd
    ui->frame_livre->hide(); //Cache la fenêtre ajouter livre
    ui->frame_button->hide(); //Affiche la fenêtre du menu
    ui->frame_retour->show(); //Affiche la fenêtre retour d'emprunt
}


void MainWindow::on_pushButton_addCd_clicked()
{
    std::string varAuteurCD;
    std::string varTitreCD;
    std::string varDateCD;
    std::string varTailleCD;

    varAuteurCD = ui->lineEdit_addCdAuteur->text().toStdString();
    varTitreCD = ui->lineEdit_addCdTitre->text().toStdString();
    varDateCD = ui->dateEdit_addCd->text().toStdString();
    varTailleCD = ui->spinBox_addCd->text().toStdString();
    affichage="";
    affichage.append(" Titre : ").append(varTitreCD).append("   Auteur : ").append(varAuteurCD).append("    Date : ").append(varDateCD).append("    Taille : ").append(varTailleCD).append("Go").append("    Type : CD");

    QString text = QString::fromStdString(affichage);
    liste << text;
    model.setStringList(liste);
    ui->listView->setModel(&model);
}



void MainWindow::on_pushButton_addDvd_clicked()
{
    std::string varAuteurDVD;
    std::string varTitreDVD;
    std::string varDateDVD;
    std::string varTailleDVD;

    varAuteurDVD = ui->lineEdit_addDvdAuteur->text().toStdString();
    varTitreDVD = ui->lineEdit_addDvdTitre->text().toStdString();
    varDateDVD = ui->dateEdit_addDvd->text().toStdString();
    varTailleDVD = ui->spinBox_addDvd->text().toStdString();
    affichage="";
    affichage.append(" Titre : ").append(varTitreDVD).append("   Auteur : ").append(varAuteurDVD).append("    Date : ").append(varDateDVD).append("    Taille : ").append(varTailleDVD).append("Go").append("    Type : DVD");

    QString text = QString::fromStdString(affichage);
    liste << text;
    model.setStringList(liste);
    ui->listView->setModel(&model);
}




void MainWindow::on_pushButton_addLivre_clicked()
{
    std::string varAuteurLivre;
    std::string varTitreLivre;
    std::string varDateLivre;
    std::string varPagesLivre;

    varAuteurLivre = ui->lineEdit_addLivreAuteur->text().toStdString();
    varTitreLivre = ui->lineEdit_addLivreTitre->text().toStdString();
    varDateLivre = ui->dateEdit_addLivre->text().toStdString();
    varPagesLivre = ui->spinBox_addLivre->text().toStdString();
    affichage="";
    affichage.append(" Titre : ").append(varTitreLivre).append("   Auteur : ").append(varAuteurLivre).append("    Date : ").append(varDateLivre).append("    Nmbr pages : ").append(varPagesLivre).append(" pages").append("    Type : Livre");

    QString text = QString::fromStdString(affichage);
    liste << text;
    model.setStringList(liste);
    ui->listView->setModel(&model);
}


void MainWindow::on_pushButton_OnOffListe_clicked()
{
    if (ui->frame_liste-> ))
    {
        ui->frame_liste->show();
    }
    else{
        ui->->hide();
    }
}

