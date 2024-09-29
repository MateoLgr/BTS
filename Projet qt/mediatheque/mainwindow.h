#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QStringListModel>

QT_BEGIN_NAMESPACE
namespace Ui { class MainWindow; }
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();

private slots:

    void on_pushButton_forSearch_clicked();

    void on_pushButton_forTake_clicked();

    void on_pushButton_forAddLivre_clicked();

    void on_pushButton_forAddDvd_clicked();

    void on_pushButton_forAddCd_clicked();

    void on_pushButton_retour_clicked();

    void on_pushButton_clicked();

    void on_pushButton_forReturn_clicked();

    void on_pushButton_addCd_clicked();



    void on_pushButton_addDvd_clicked();

    void on_pushButton_addLivre_clicked();

private:
    Ui::MainWindow *ui;
    std::string affichage;
    QStringList liste;
    QStringListModel model;
};
#endif // MAINWINDOW_H
