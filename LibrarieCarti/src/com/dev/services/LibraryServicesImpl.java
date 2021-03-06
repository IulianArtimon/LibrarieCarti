package com.dev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dao.LibraryDao;
import com.dev.model.LibraryModel;
import com.dev.services.LibraryServices;

@Service
@Transactional
public class LibraryServicesImpl implements LibraryServices 
{
    
    
    @Autowired
    private LibraryDao librarydao;

    @Override
    public void AddBooks(LibraryModel librarymodel) 
    {
        librarydao.AddBooks(librarymodel);
        
    }
    
    @Override
    public void UpdateBooks(LibraryModel librarymodel) 
    {
        librarydao.UpdateBooks(librarymodel);
        
    }
    
    @Override
    public void DeleteBook(int id) 
    {
        librarydao.DeleteBook(id);
        
    }
    
    @Override
    public List<LibraryModel> GetLibrary() 
    {
        return librarydao.GetLibrary();
    }    

    }